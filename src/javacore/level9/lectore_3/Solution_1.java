package javacore.level9.lectore_3;

/**
 * TableAdapter
 * Измени класс TableAdapter так, чтобы он адаптировал ATable к BTable.
 * Метод getHeaderText должен возвращать такую строку "[username] : tablename".
 * Пример, "[Amigo] : DashboardTable".
 */

public class Solution_1 {
    public static void main(String[] args) {
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }


    public static class TableAdapter implements BTable {
        private ATable aTable;

        public TableAdapter(ATable aTable) {
            this.aTable = aTable;
        }

        @Override
        public String getHeaderText() {
            return String.format("[%s] : %s", aTable.getCurrentUserName(), aTable.getTableName());
        }
    }

    public interface ATable {
        String getCurrentUserName();

        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    }
}
