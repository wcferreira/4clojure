(ns easy.reverse-a-sequence-test
  (:require
    [easy.reverse-a-sequence :as revseq]
    [clojure.test            :refer :all]))

(deftest reverse-sequence-test
  (is (= (revseq/reverse-sequence [1 2 3 4 5]) [5 4 3 2 1]))
  (is (= (revseq/reverse-sequence (sorted-set 5 7 2 7)) '(7 5 2)))
  (is (= (revseq/reverse-sequence [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]])))






