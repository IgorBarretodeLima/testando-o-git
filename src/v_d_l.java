import static java.lang.IO.print;
void main() {
    print("Qual é a taxa(porcentagem) de presença:");
    double taxa = Double.parseDouble(IO.readln());
    if(taxa<75) {

        print("Esta reprovado");
    } else {
        print(" Digite a primeira nota:");
        float P1 = Float.parseFloat(IO.readln());

        print(" Digite a sengunda nota:");
        float P2 = Float.parseFloat(IO.readln());

        print(" Digite a terceira nota:");
        float P3 = Float.parseFloat(IO.readln());

        print(" Digite a quarta nota:");
        float P4= Float.parseFloat(IO.readln());

        float Media = (P1+P2+P3+P4) / 4 ;
        if(Media >=7) {
            IO.print("Aprovado\uD83D\uDE0E ");
        } else {
            IO.print("Acesso negado, você é mó but \uD83D\uDD95"); }       }

}
