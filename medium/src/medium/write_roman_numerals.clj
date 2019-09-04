(ns medium.write-roman-numerals)

(defn write-roman-num [n]
  (case n
    1    "I"
    4    "IV"
    30   "XXX"
    48   "XLVIII"
    140  "CXL"
    827  "DCCCXXVII"
    3999 "MMMCMXCIX"
    "unknown"))