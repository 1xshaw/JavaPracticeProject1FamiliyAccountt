public class FamilyAccount {
    public static void main(String[] args){
        boolean isFlag = true;
        String details ="";
        int balance = 10000;
        int income = 0;
        String comment = "";

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
                    //System.out.println("1 收支明细\n");
                    System.out.println("---------------------当前收支记录---------------------");
                    System.out.println("收支\t账户金额\t收支金额\t说明\n");
                    System.out.println(details);
                    System.out.println("----------------------------------------------------\n\n");

                    break;
                case '2':
                    //System.out.println("2 登记收入\n");
                    System.out.print("本次收入金额： ");
                    income = Utility.readNumber();
                    System.out.print("本次收入说明： ");
                    comment = Utility.readString();
                    System.out.println("-----------------------登记完成-----------------------\n\n");
                    balance += income;
                    details += "收入\t"+balance+"\t"+income+"\t\t"+comment+"\n";
                    break;
                case '3':
                    //System.out.println("3 登记支出\n");
                    System.out.print("本次支出金额： ");
                    income = Utility.readNumber();
                    System.out.print("本次支出说明： ");
                    comment = Utility.readString();
                    System.out.println("-----------------------登记完成-----------------------\n\n");
                    balance -= income;
                    details += "支出\t"+balance+"\t"+income+"\t\t"+comment+"\n";
                    break;
                case '4':
                    //System.out.println("4 退   出\n");
                    System.out.println("请确认是否退出 （Y/N）:\n");
                    char quitConfirm = Utility.readConfirmSelection();

                    if (quitConfirm =='Y'){
                        isFlag = false;
                        break;
                    }
                }
            }

        }
    }
