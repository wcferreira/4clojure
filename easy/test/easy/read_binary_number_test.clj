(ns easy.read-binary-number-test
  (:require
           [clojure.test            :refer :all]
           [easy.read-binary-number :as rbn]))


(def first-input   {:number "0"                :expected 0})
(def second-input  {:number "111"              :expected 7})
(def third-input   {:number "1000"             :expected 8})
(def fourth-input  {:number "1001"             :expected 9})
(def fifth-input   {:number "11111111"         :expected 255})
(def sixth-input   {:number "10101010101"      :expected 1365})
(def seventh-input {:number "1111111111111111" :expected 65535})

(deftest convert-bin-to-dec-test
  (is (= (rbn/convert-bin-to-dec (:number first-input)) (:expected first-input)))
  (is (= (rbn/convert-bin-to-dec (:number second-input)) (:expected second-input)))
  (is (= (rbn/convert-bin-to-dec (:number third-input)) (:expected third-input)))
  (is (= (rbn/convert-bin-to-dec (:number fourth-input)) (:expected fourth-input)))
  (is (= (rbn/convert-bin-to-dec (:number fifth-input)) (:expected fifth-input)))
  (is (= (rbn/convert-bin-to-dec (:number sixth-input)) (:expected sixth-input)))
  (is (= (rbn/convert-bin-to-dec (:number seventh-input)) (:expected seventh-input))))