(ns easy.factorial-fun-test
  (:require
    [clojure.test       :refer :all]
    [easy.factorial-fun :as fat]))


(deftest factorial-fun-test
  (is (= (fat/factorial-fun 1) 1))
  (is (= (fat/factorial-fun 3) 6))
  (is (= (fat/factorial-fun 5) 120))
  (is (= (fat/factorial-fun 8) 40320))
  (is (= (fat/factorial-fun 0) AssertionError)))
