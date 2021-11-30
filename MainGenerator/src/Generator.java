import java.util.Scanner;
public class Generator {
	static int quanteOpzioni = 1;
	static String[] listaOpzioni;

	static Scanner input=new Scanner(System.in);
	//ciao
	public static void main(String argv[]) {
		System.out.print("Quante opzione vuoi dare al tuo programma? ");
		quanteOpzioni=Integer.parseInt(input.nextLine());
		listaOpzioni= new String[quanteOpzioni];
		for(int i=0;i<quanteOpzioni;i++) {
			System.out.print((i+1)+"# Opzione = ");
			listaOpzioni[i]=input.nextLine();
		}
		System.out.println();
		System.out.println("ECCO IL TUO FANTASTICO MAIN!");
		System.out.println();System.out.println();

		String output=
				"import java.util.Scanner;\n"+
				"public class Generator {\n"+
						"\tstatic Scanner input=new Scanner(System.in);\n"+
						"\tpublic static void main(String argv[]) {\n"+
						"\t\tSystem.out.println(\"Benvenuto!\");\n"+
						"\t\twhile(true) {\n"+
						"\t\tSystem.out.print("+generaMenu()+");\n"+
						generaSwitchCase()+
						"\t\t\tSystem.out.println();System.out.println();System.out.println();\n"+
						"\t\t}\n"+
						"\t}\n"+
						"}";
		System.out.print(output);
	}

	static String generaMenu() {
		String output = "\n\t\t\t\"Cosa desideri fare?\\n\" +\n\t\t\t";
		for (int i = 0; i < listaOpzioni.length; i++)
			output += "\"\\t[" + (i + 1) + "] •" + listaOpzioni[i] + "\\n\" +\n\t\t\t";
		return output+"\"scelta = \"";
	}

	static String generaSwitchCase() {
		String output = "\t\t\tswitch(input.nextInt()) {\n";
		for (int i = 0; i < quanteOpzioni; i++)
			output += "\t\t\t\tcase " + (i + 1) + ":\n\t\t\t\t\tinput.nextLine();"+
		"\n\t\t\t\t\t//" + listaOpzioni[i] +
			"\n\t\t\t\t\t\n\t\t\t\t\tbreak;\n";
		output += "\t\t\t\tdefault:\n\t\t\t\t\tinput.nextLine();\n\t\t\t\t\t\n\t\t\t\t\tbreak;\n\t\t\t}\n";
		return output;
	}
}