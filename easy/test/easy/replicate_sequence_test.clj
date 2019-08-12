(ns easy.replicate-sequence-test
  (:require
    [clojure.test            :refer :all]
    [easy.replicate-sequence :as rs]))

(def first-input  {:coll [1 2 3]       :times 2})
(def second-input {:coll [:a :b]       :times 4})
(def third-input  {:coll [4 5 6]       :times 1})
(def fourth-input {:coll [[1 2] [3 4]] :times 2})
(def fifth-input  {:coll [44 33]       :times 2})

(deftest replicate-sequence-test
  (is (= (rs/replicate-sequence (:coll first-input)  (:times first-input))  '(1 1 2 2 3 3)))
  (is (= (rs/replicate-sequence (:coll second-input) (:times second-input)) '(:a :a :a :a :b :b :b :b)))
  (is (= (rs/replicate-sequence (:coll third-input)  (:times third-input))  '(4 5 6)))
  (is (= (rs/replicate-sequence (:coll fourth-input) (:times fourth-input)) '([1 2] [1 2] [3 4] [3 4])))
  )
