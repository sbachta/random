package com.example.random.problems.neat;

import java.util.HashSet;
import java.util.Set;

/**
 * Every valid email consists of a local name and a domain name, separated by the '@' sign.
 * Besides lowercase letters, the email may contain one or more '.' or '+'.
 * For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
 *
 * If you add periods '.' between some characters in the local name part of an email address, mail sent there will
 * be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.
 * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
 *
 * If you add a plus '+' in the local name, everything after the first plus sign will be ignored.
 * This allows certain emails to be filtered. Note that this rule does not apply to domain names.
 * For example, "m.y+name@email.com" will be forwarded to "my@email.com".
 *
 * It is possible to use both of these rules at the same time.
 * Given an array of strings emails where we send one email to each emails[i],
 * return the number of different addresses that actually receive mails.
 *
 * Constraints:
 * 1 <= emails.length <= 100
 * 1 <= emails[i].length <= 100
 * emails[i] consist of lowercase English letters, '+', '.' and '@'.
 * Each emails[i] contains exactly one '@' character.
 * All local and domain names are non-empty.
 * Local names do not start with a '+' character.
 * Domain names end with the ".com" suffix.
 * Domain names must contain at least one character before ".com" suffix.
 */

public class _929_UniqueEmailAddress {

    public int numUniqueEmails(String[] emails) {
        Set<String> collection = new HashSet<>();

        for (String email : emails) {
            String[] split = email.split("@");
            split[0] = split[0].replace(".", "");
            if (split[0].contains("+")){
                split[0] = split[0].substring(0, split[0].indexOf("+"));
            }

            collection.add(split[0]+"@"+split[1]);

            System.out.println(email);
            System.out.println(collection);
            System.out.println("\n");
        }

        return collection.size();
    }
}
