(ns easy.pack-sequence-test
  (:require
            [clojure.test       :refer :all]
            [easy.pack-sequence :as ps]))

(def first-input  {:coll [1 1 2 1 1 1 3 3]   :expected '((1 1) (2) (1 1 1) (3 3))})
(def second-input {:coll [:a :a :b :b :c]    :expected '((:a :a) (:b :b) (:c))})
(def third-input  {:coll [[1 2] [1 2] [3 4]] :expected '(([1 2] [1 2]) ([3 4]))})

(deftest pack-seq-test
  (is (= (ps/pack-seq (:coll first-input)) (:expected first-input)))
  (is (= (ps/pack-seq (:coll second-input)) (:expected second-input)))
  (is (= (ps/pack-seq (:coll third-input)) (:expected third-input))))