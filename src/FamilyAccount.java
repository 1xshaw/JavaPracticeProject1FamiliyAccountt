public class FamilyAccount {
    public static void main(String[] args){
        boolean isFlag = true;

        while(isFlag){
            System.out.println("---------------------家庭记账软件---------------------\n");
            System.out.println("                    1 收支明细");
            System.out.println("                    2 登记收入");
            System.out.println("                    3 登记支出");
            System.out.println("                    4 退   出\n");
            System.out.println("                    请选择： 1-4");

            // 获取用户的选择
            char selection = Utility.readMenuSelection();

            switch(selection){
                case '1':
                    System.out.println("1 收支明细\n");
                    break;
                case '2':
                    System.out.println("2 登记收入\n");
                    break;
                case '3':
                    System.out.println("3 登记支出\n");
                    break;
                case '4':
                    System.out.println("4 退   出\n");
                    isFlag = false;
                    break;
                }
            }

        }
    }
