(ns easy.split-sequence-test
  (:require
            [clojure.test        :refer :all]
            [easy.split-sequence :as ss]))

(def first-input  {:offset 3 :coll [1 2 3 4 5 6]       :expected [[1 2 3] [4 5 6]]})
(def second-input {:offset 1 :coll [:a :b :c :d]       :expected [[:a] [:b :c :d]]})
(def third-input  {:offset 2 :coll [[1 2] [3 4] [5 6]] :expected [[[1 2] [3 4]] [[5 6]]]})

(deftest split-sequence-test
  (is (= (ss/split-seq (:offset first-input) (:coll first-input)) (:expected first-input)))
  (is (= (ss/split-seq (:offset second-input) (:coll second-input)) (:expected second-input)))
  (is (= (ss/split-seq (:offset third-input) (:coll third-input)) (:expected third-input))))
