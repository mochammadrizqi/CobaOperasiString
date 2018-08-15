import java.util.Scanner;
public class COnvertVocal2Angka {
    public static void tampilJudul(String identitas) {
        System.out.println("identitas: "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal ke angka)\n");
    }
    
    private static String tampilInput(){
        Scanner scanner = new Scanner (System.in);
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat asli: "+ kalimat);
        
        return kalimat;
    }
    
    private static String vocal2Angka(String kalimat){
        char [][]arConvert = {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
        
        kalimat = kalimat.toLowerCase();
        for (int i=0;i<arConvert.length;i++)
            
            kalimat = kalimat.replace(arConvert[i][0],arConvert[i][1]);
        
        return kalimat;
    } 
    private static void tampilPerKata(String kalimat, String convert){
        String[] arrKal = kalimat.split(" ");
        String[] arrCon = convert.split(" ");
        
        for (int i=0; i<arrKal.length;i++)
            System.out.println(arrKal[i]+" => "+ arrCon[i]);
    }
    private static void tampilHasil(String convert){
        System.out.println("Kalimat alay angka: "+ convert);
    }
    
    
}
