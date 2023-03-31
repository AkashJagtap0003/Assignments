public class Assignment11 {
        public static void main(String[] args) {
            
           
             
                char ch = args[0].charAt(0);
    
                
                if (Character.isDigit(ch)) {
                  
                    System.out.println("The character is digit: " + ch);
                    System.out.println("Digit value: " + Character.getNumericValue(ch));
                    System.out.println("Code point: " + (int) ch);
                } else if (Character.isLetter(ch)) {
                   
                    if (Character.isLowerCase(ch)) {
                      
                        char upperCh = Character.toUpperCase(ch);
                        System.out.println("The character is a lowercase : " + ch);
                        System.out.println("Uppercase letter: " + upperCh);
                        System.out.println("Code point: " + (int) ch);
                    } else {
                        
                        char lowerCh = Character.toLowerCase(ch);
                        System.out.println("The character is an uppercase : " + ch);
                        System.out.println("Lowercase letter: " + lowerCh);
                        System.out.println("Code point: " + (int) ch);
                    }
                } 
            }
        }

