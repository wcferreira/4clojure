(ns easy.palindrome-detector-test
  (:require
    [clojure.test             :refer :all]
    [easy.palindrome-detector :as pdetector]))

(deftest palindrome-detector-test
  (is (false? (pdetector/palindrome-detector '(1 2 3 4 5))))
  (is (true? (pdetector/palindrome-detector "racecar")))
  (is (true? (pdetector/palindrome-detector [:foo :bar :foo])))
  (is (true? (pdetector/palindrome-detector '(1 1 3 3 1 1))))
  (is (false? (pdetector/palindrome-detector '(:a :b :c)))))
