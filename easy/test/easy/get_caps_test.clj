(ns easy.get-caps-test
  (:require
    [clojure.test      :refer :all]
    [easy.get-the-caps :as gcaps]))


(def first-input "HeLlO, WoRlD!")
(def second-input "nothing")
(def third-input "$#A(*&987Zf")

(deftest get-caps-test
  (is (= (gcaps/get-caps first-input) "HLOWRD"))
  (is (empty? (gcaps/get-caps second-input)))
  (is (= (gcaps/get-caps third-input) "AZ")))

(deftest is-upper-test
  (is (true? (gcaps/is-upper? \A)))
  (is (true? (gcaps/is-upper? \B)))
  (is (false? (gcaps/is-upper? \d)))
  (is (false? (gcaps/is-upper? \a)))
  (is (false? (gcaps/is-upper? \e))))
