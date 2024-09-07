public class SelecaoDeAuditorio {

    public static void selecionarAuditorio(int num) {
        if (num <= 0 || num > 350) {
            System.out.println("Número de convidados inválido");
            return;
        }

        if (num <= 150) {

            System.out.println("Preferível usar o auditório Alfa");
        } else if (num <= 220) {
            System.out.println("Preferível usar o auditório Alfa, porém, incluir " + (num - 150) + " cadeiras no Auditório!");
        } else {
            System.out.println("Preferível usar o auditório Beta");
        }
    }
}

