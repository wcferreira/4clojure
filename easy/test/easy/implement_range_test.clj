(ns easy.implement-range-test
  (:require
    [clojure.test         :refer :all]
    [easy.implement-range :as irange]))


(deftest range-test
  (is (= (irange/my-range 1 4) '(1 2 3)))
  (is (= (irange/my-range -2 2) '(-2 -1 0 1)))
  (is (= (irange/my-range 5 8) '(5 6 7))))


