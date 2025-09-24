import java.io.File;
import java.util.Scanner;

public class JackieService {
    int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public JackieService(){
        setMatrix(new int[1][1]);
    }

    public JackieService(String filename){
        int countLines = countLines(filename);
    }

    private int countLines(String filename){
        File fbe = new File(filename);
        Scanner scanner = new Scanner(fbe);
        int result = 0;
        while(scanner.hasNextLine()){
            scanner.nextLine();
            result++;
        }
        return result;
    }
}
