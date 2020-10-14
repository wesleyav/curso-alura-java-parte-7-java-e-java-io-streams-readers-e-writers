import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Cliente cliente = new Cliente();
		// cliente.setNome("Nico");
		// cliente.setProfissao("Dev");
		// cliente.setCpf("12345678910");
		//
		// ObjectOutputStream oos = new ObjectOutputStream(new
		// FileOutputStream("cliente.bin"));
		// oos.writeObject(cliente);
		// oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCpf());

	}

}
