package org.muzir.interview.klarna;

import java.util.Arrays;
import java.util.Set;

public class DiskSpace {
	public static boolean isWritable(int blockSize, int fileSize, Set<Integer> occupiedSectors) {
		if (occupiedSectors == null) {
			return false;
		}
		if (occupiedSectors.isEmpty()) {
			return blockSize >= fileSize;
		}
		int[] occupiedSectorsArray = occupiedSectors.stream().mapToInt(Integer::intValue).toArray();
		int occupiedSectorsArrayLength = occupiedSectorsArray.length;
		if (occupiedSectorsArrayLength == 1) {
			int firstChunk = occupiedSectorsArray[0];
			int lastChunk = blockSize - occupiedSectorsArray[0];
			return firstChunk > fileSize || lastChunk > fileSize;
		}
		Arrays.sort(occupiedSectorsArray);

		for (int i = 0; i < occupiedSectorsArrayLength; i++) {
			if (i == 0) {
				int firstChunk = occupiedSectorsArray[i];
				if (firstChunk > fileSize) {
					return true;
				}
			}
			if (i == occupiedSectorsArrayLength - 1) {
				int lastChunk = (blockSize - 1) - occupiedSectorsArray[i];
				if (lastChunk > fileSize) {
					return true;
				}
			} else {
				int current = occupiedSectorsArray[i];
				int next = occupiedSectorsArray[i + 1];
				if (next - current > fileSize) {
					return true;
				}
			}
		}
		return false;
	}
}
