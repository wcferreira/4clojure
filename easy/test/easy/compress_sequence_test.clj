(ns easy.compress-sequence-test
  (:require
    [clojure.test           :refer :all]
    [easy.compress-sequence :as cs]))

(def first-input "Leeeeeerrroyyy")
(def second-input [1 1 2 3 3 2 2 3])
(def third-input [[1 2] [1 2] [3 4] [1 2]])

(deftest compress-seq-test
  (is (= (cs/compress-seq first-input) "Leroy"))
  (is (= (cs/compress-seq second-input) '(1 2 3 2 3)))
  (is (= (cs/compress-seq third-input) '([1 2] [3 4] [1 2]) )))