//메인 crud에서 사용자 입력을 받고,
//오퍼레이션 crud에서 사용자 입력에 맞는 동작을 수행하고,
//엑셀 crud에서 엑셀 관련한 동작을 수행하게 해서 관리를 깔끔하게 할 것임
//클래스 구분하고 불러오는 연습을 겸함

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class MainCRUD {
    public static void main(String[] args) throws IOException{
        ExcelCRUD excelRead = new ExcelCRUD();
        ExcelCRUD excelSave = new ExcelCRUD();
        OperationCRUD operation = new OperationCRUD();

        //사용자 입력을 받을 때, 이걸 쓰던지
        InputStream in=System.in;
        InputStreamReader reader=new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        //이걸 쓰던지 하자.
        Scanner scanner = new Scanner(System.in);

        //이번 연습에서는 둘 다 쓸거임. 왜요? 연습이니까요 음음

        int userWant=0;

        while(true){
            System.out.println("1. create data");
            System.out.println("2. read board");
            System.out.println("3. update data");
            System.out.println("4. delete data");
            System.out.println("5. save as excel file");
            System.out.println("6. load excel file");
            System.out.println("0. Quit");
            System.out.println("insert number: ");
            userWant=Integer.valueOf(bufferedReader.readLine());
            switch(userWant){
                case 0:
                break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
            }

        }
    }
}