package movietheatersystem;

public class TicketList {

    Util util = new Util();
    Ticket inicio, fin;
    int folioInc;

    public TicketList() {
        this.inicio = null;
        this.fin = null;
        this.folioInc = 0;
    }

    public Ticket getFin() {
        return fin;
    }

    public boolean vacio() {
        return this.inicio == null;
    }

   public int obtenerBoletosVendidos() {
      Ticket aux=new Ticket();
     aux= this.inicio;
     int i = 0;
        while (aux != null) {
            i++;
            aux = aux.getNext();
        }
        return i;
     }

    private void anadirALista(Ticket nuevo) {
        if (this.vacio()) {
            this.inicio = nuevo;
            this.fin = nuevo;
        } else {

            this.fin.setNext(nuevo);
            this.fin = nuevo;
        }

    }

    public Ticket totalesTickets() {
        Ticket totales = new Ticket();
        Ticket aux = this.inicio;
        while (aux != null) {
            total += aux.getTotal();
            aux.getNext();
        }
        return total;
    }

    public void formarTicketParaAnadir(String folio, String name, int ticketStandard, int ticketKids, int ticketElderly, float total) {
        Ticket nuevo = new Ticket(folio, name, ticketStandard, ticketKids, ticketElderly, total);
        anadirALista(nuevo);
    }

}
