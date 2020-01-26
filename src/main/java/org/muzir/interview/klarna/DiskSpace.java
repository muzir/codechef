package org.muzir.interview.klarna;

import java.util.Arrays;
import java.util.Set;

public class DiskSpace {
	public static boolean isWritable(int blockSize, int fileSize, Set<Integer> occupiedSectors) {
		if (occupiedSectors == null) {
			throw new IllegalArgumentException("occupiedSectors can't be null");
		}
		if (occupiedSectors.isEmpty()) {
			return blockSize >= fileSize;
		}
		int[] occupiedSectorsArray = occupiedSectors.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(occupiedSectorsArray);
		if (isFirstOrLastChunkHasEnoughSpace(occupiedSectorsArray, fileSize, blockSize)) {
			return true;
		}
		return isEnoughSpaceBetweenChunks(occupiedSectorsArray, fileSize);
	}

	private static boolean isEnoughSpaceBetweenChunks(int[] occupiedSectorsArray, int fileSize) {
		int lastChunkIndex = occupiedSectorsArray.length - 1;
		for (int i = 0; i < lastChunkIndex; i++) {
			int currentChunkValue = occupiedSectorsArray[i];
			int nextChunkValue = occupiedSectorsArray[i + 1];
			if ((nextChunkValue - currentChunkValue) > fileSize) {
				return true;
			}
		}
		return false;
	}

	private static boolean isFirstOrLastChunkHasEnoughSpace(int[] occupiedSectorsArray, int fileSize, int blockSize) {
		int lastChunkIndex = occupiedSectorsArray.length - 1;
		int lastChunkValue = occupiedSectorsArray[lastChunkIndex];
		int firstChunkSpace = occupiedSectorsArray[0];
		int lastChunkSpace = blockSize - lastChunkValue;
		return firstChunkSpace > fileSize || (lastChunkSpace != 0 && lastChunkSpace >= fileSize);
	}
}
