import java.util.*;

public class Receita {
    private String nomeReceita;
    private int tempPreparo;
    private String tipoReceita;
    private String modoDepreparo;
    private List<Ingredientes> listaDeIngredientes = new ArrayList<>();

    public void AdicionarIngrediente(Ingredientes ingrediente) {
        listaDeIngredientes.add(ingrediente);
    }

    public Receita(String nomeReceita, int tempPreparo, String tipoReceita, String modoDepreparo) {
        this.nomeReceita = nomeReceita;
        this.tempPreparo = tempPreparo;
        this.tipoReceita = tipoReceita;
        this.modoDepreparo = modoDepreparo;
    }

    public List<Ingredientes> listaIngredientes() {
        return listaDeIngredientes;
    }

    public String getNomeReceita() {
        return nomeReceita;
    }

    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public int getTempPreparo() {
        return tempPreparo;
    }

    public void setTempPreparo(int tempPreparo) {
        this.tempPreparo = tempPreparo;
    }

    public String getTipoReceita() {
        return tipoReceita;
    }

    public void setTipoReceita(String tipoReceita) {
        this.tipoReceita = tipoReceita;
    }

    public String getModoDepreparo() {
        return modoDepreparo;
    }

    public void setModoDepreparo(String modoDepreparo) {
        this.modoDepreparo = modoDepreparo;
    }

    @Override
    public String toString() {
        return "Receitas [nomeReceita=" + nomeReceita + ", tempPreparo=" + tempPreparo + ", tipoReceita=" + tipoReceita
                + ", modoDepreparo=" + modoDepreparo + ", listaDeIngredientes=" + listaDeIngredientes + "]";
    }

}
