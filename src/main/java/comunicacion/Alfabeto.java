package comunicacion;

public class Alfabeto extends Pictograma{

	private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] strings, String interpretacion) {
        super(origen);
    	this.letras = strings;
        this.interpretacion = interpretacion;
    }

	
	public String[] getLetras() {return letras;}
	public void setLetras(String[] letras) {this.letras = letras;}
	
	public String getInterpretacion() {return interpretacion;}
	public void setInterpretacion(String interpretacion) {this.interpretacion = interpretacion;}
	
	
	public int cantidadLetras(){
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	
	@Override
	public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cantidadLetras(); i++) {
            sb.append(letras[i]);
            if (i < cantidadLetras() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
	
	
}
