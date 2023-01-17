public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 || tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        int tempTonerLevel = tonerLevel + tonerAmount;
        if (tonerAmount <= 0 || tonerAmount > 100 || tempTonerLevel > 100) {
            return -1;
        } else {
            tonerLevel = tempTonerLevel;
            return tonerLevel;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = pagesToPrint / 2 + pagesToPrint % 2;
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
