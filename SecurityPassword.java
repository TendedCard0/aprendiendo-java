public class SecurityPassword {
    public static void main(String[] args) {
        String password = "Undforgiven3";
        int longitud = password.length();

        if (longitud >= 8){
            System.out.println("Tu contraseña es segura ;)");
        }else {
            System.out.println("Cuidado tu contraseña es insegura!!!");
        }
    }
    
}
