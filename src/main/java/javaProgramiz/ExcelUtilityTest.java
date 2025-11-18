package javaProgramiz;

public class ExcelUtilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String xlPath="D:\\BDDWithDDT\\src\\test\\resources\\testData\\TestData.xlsx";
		String str1=ExcelUtility.getCellValue(xlPath, "Groups", 1, 0);
		System.out.println(str1);
	}

}
