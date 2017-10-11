package Java809;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q1 {

	public static void main(String[] args) {
		// 

	/*			Path source = Paths.get("/green.txt");
				Path target = Paths.get("/colors/yellow.txt");
				Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
				Files.delete(source);
*/
	}

}


/*answer
Got from https://magiclen.org/ocpjp-move-file/

Program line 15 will move "/green.txt" to "/colors/yellow.txt", the original "/colors/yellow.txt" will be overwritten, and "/green.txt" will be deleted. 


Here the use of StandardCopyOption.ATOMIC_MOVE this CopyOption, will move the file action into atomic, that is, 
in this process will not be involved in other threads (such as grab the file write permissions).

Option A, written off.

Option B, because "/colors/yellow.txt" already exists, does not use StandardCopyOption.REPLACE_EXISTING this CopyOption, so it will throw FileAlreadyExistsException before moving the file. The file will not be moved.

Option C does not.

Option D, will throw FileAlreadyExistsException, for the reasons see option B.

Note that the implementation of the program here may have some problems, be Java BUG. The author of the Linux operating system in the EXT4 file system implementation of this program, StandardCopyOption.ATOMIC_MOVE this CopyOption will overwrite the existing file, it will not throw FileAlreadyExistsException. A NoSuchFileException is thrown when the program executes to line 10 because the source file is deleted after it is moved.
*/