import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PraktikumTests {

    private final String cardHolderName;
    private final boolean expected;

    public PraktikumTests(String cardHolderName, boolean expected) {
        this.cardHolderName = cardHolderName;
        this.expected = expected;
    }
    @Parameterized.Parameters (name = "Проверка имени: {0}")
    public static Object[][] getCardHolderName(){
        return new Object[][]{
                {"Aleks Burns", true},
                {"Aleks Burnsssssssss", true},
                {"AleksBurns", false},
                {"Aleks Lee Burns", false},
                {" AleksBurns", false},
                {"AleksBurns ", false},
                {"AB", false},
                {"Aleks Burnssssssssss", false},
        };
    }
    @Test
    public void checkCardHolderName(){
        Account account = new Account(cardHolderName);
        Assert.assertEquals(expected, account.checkNameToEmboss());
    }
}
