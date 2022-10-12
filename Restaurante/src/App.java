public class App {
    public static void main(String[] args) throws Exception {
        Endereco enderecoThiagosRestaurante = new Endereco("41213000", "Ulysses Guimaraes");

        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        restaurante.setNomeFantasia("Thiagos Restautante");
        restaurante.setcnpj("000.000.000.1-11");
        
        System.out.println(restaurante);

    }
}
