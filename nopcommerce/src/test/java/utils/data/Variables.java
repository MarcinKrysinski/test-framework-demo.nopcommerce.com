package utils.data;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

public class Variables {
    public static final String email = UUID.randomUUID().toString().replace("-", "") + "@" + RandomStringUtils.randomAlphabetic(4) + "." + RandomStringUtils.randomAlphabetic(3);
    public static final String emailWithoutMonkey = UUID.randomUUID().toString().replace("-", "") + "." + RandomStringUtils.randomAlphabetic(3);
    public static final String emailWithoutDot = UUID.randomUUID().toString().replace("-", "") + "@" + RandomStringUtils.randomAlphabetic(4) + RandomStringUtils.randomAlphabetic(3);
    public static final String emailWithoutDomain = UUID.randomUUID().toString().replace("-", "") + "@" + "." + RandomStringUtils.randomAlphabetic(3);
    public static final String passwordTooShort = UUID.randomUUID().toString().replace("-", "").substring(0,5);
    public static final String incorrectConfirmPassword = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
    public static final String firstName = UUID.randomUUID().toString().replace("-", "").substring(0, 7);
    public static final String lastName = UUID.randomUUID().toString().replace("-", "").substring(0, 10);


}
