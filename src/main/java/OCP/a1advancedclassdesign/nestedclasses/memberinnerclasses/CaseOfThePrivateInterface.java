package OCP.a1advancedclassdesign.nestedclasses.memberinnerclasses;

public class CaseOfThePrivateInterface {

    private interface Secret{ //interfata privata se refera doar la clasa externa curenta
        public void shh();
    }

    class DontTell implements Secret{

        @Override
        public void shh() {

        }
    }
}
