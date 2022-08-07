public class BudgetAllocation {


    public static void main(String[] args) {
        double[] zlz;
        double[] sqb;
        double[] lx;
        double zlzTemp = 14.79 + 12.89;
        double sqbTemp = 107.4;
        double lxTemp = 98;
        zlz = new double[]{zlzTemp, zlzTemp / 3, zlzTemp / 3}; //   z   s   l
        sqb = new double[]{sqbTemp, 59.9 + 13.1 + 5.9 + 3, 4.6 + 3 + 8.0 / 3};                  //   s   z   l
        lx = new double[]{lxTemp, lxTemp / 3, lxTemp / 3};//   l   z   s

        double SqbToZlz = zlz[1] - sqb[1];
        double LxToZlz = zlz[2] - lx[1];
        double LxToSqb = sqb[2] - lx[2];

        System.out.println("苏清波需要付给周玲枝的钱：" + String.format("%.2f", SqbToZlz));
        System.out.println("刘炫需要付给周玲枝的钱：" + String.format("%.2f", LxToZlz));
        System.out.println("刘炫需要付给苏清波的钱：" + String.format("%.2f", LxToSqb));
    }
}
