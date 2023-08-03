package agenda;
import java.util.ArrayList;
import java.util.List;

public class tarefa{
    private String dataEntrega;
    private boolean feito;
    private List<tarefa> task = new ArrayList<>();

    public tarefa(String dataEntrega, boolean feito){
        this.dataEntrega = dataEntrega;
        this.feito = false;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
