  
  # Index keyword restrictions
* The length of words (the number of words) is 2 or more and 100,000 or less.
* The length of each word is 1 or more and 10,000 or less, unless it is an empty string.
* The sum of the total word lengths is not less than 2 and not more than 1,000,000.
* Input keywords are not duplicates Only one is provided for words.
* It is assumed that each word consists only of lowercase letters and no special characters or numbers.

# Search keyword restrictions
* The length of queries (number of search keywords) is 2 or more and 100,000 or less.
* The length of each search keyword is 1 or more and 10,000 or less, unless it is an empty string.
* The sum of all search keyword lengths is between 2 and 1,000,000.
* Search keywords may be duplicated.
* Each search keyword contains only lowercase alphabetic characters and the wildcard character '?' It is assumed that it consists only of , and does not include special characters or numbers.
* Search keywords contain one or more wildcard characters '?', where '?' is given only as one of the suffixes of each search keyword.
* '?' There is no alphabet after it.
* For example, "fro??", "?????" are possible keywords.
  On the other hand, "frodo" (without '?'), ??ont", "fr?do" (with '?' in the middle), and "?ro??" (with '?' on both sides) are impossible Keywords.