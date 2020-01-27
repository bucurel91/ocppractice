package OCP.a6exceptionsandassertions.rethrowingexceptions;

import java.sql.SQLException;
import java.util.zip.DataFormatException;

public class RethrowException {

    public static void main(String[] args)  {

        try {
            rethrowing();
        } catch (Exception e) {
            System.out.println("exceptieeee");
        }
    }

    public static void parseData() throws SQLException, DataFormatException{

       throw new NullPointerException();
    }

    public static void multiCatch() throws DataFormatException, SQLException {

        try {
            parseData();
        }catch (SQLException | DataFormatException e){
            System.err.println(e.getMessage());
            throw e;
        }

    }

    public static void rethrowing() throws DataFormatException, SQLException {

        try {
            parseData();
        } catch (Exception e) {
           System.err.println(e.getMessage());//in loc la adadaugarea tuturor exceptiilor ptr multicatching, putem sa adaugam exceptie generica Exception e
           throw e; //astfel in cazul asta va fi acoperit si alte cazuri de exceptii, ca NullPointer si va fi printat de System.err, iar in cazul de multicatching cazul cu nullpointer nu va fi handluit.
        }
    }

}
