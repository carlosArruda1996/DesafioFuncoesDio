public class Games {

    public void rankGame(long wins, long losses){
        long balance = wins - losses;

        if (balance <= 10){
            System.out.println("O herói tem saldo de " + balance + " e está no nivel Ferro");
        } else if (balance >= 11 && balance <= 20) {
            System.out.println("O herói tem saldo de " + balance + " e está no nivel Bronze");
        } else if (balance >= 21 && balance <= 50) {
            System.out.println("O herói tem saldo de " + balance + " e está no nivel Prata");
        } else if (balance >= 51 && balance <= 80) {
            System.out.println("O herói tem saldo de " + balance + " e está no nivel Ouro");
        } else if (balance >= 81 && balance <= 90) {
            System.out.println("O herói tem saldo de " + balance + " e está no nivel Diamante");
        } else if (balance >= 91 && balance <= 100) {
            System.out.println("O herói tem saldo de " + balance + " e está no nivel Lendário");
        } else if (balance <= 101) {
            System.out.println("O herói tem saldo de " + balance + " e está no nivel Imortal");
        } else System.out.println("Numero de vitorias indefinido");

    }
}
