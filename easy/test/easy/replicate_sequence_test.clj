(ns easy.replicate-sequence-test
  (:require
    [clojure.test            :refer :all]
    [easy.replicate-sequence :as rs]))

;;          (= (__ [1 2 3] 2) '(1 1 2 2 3 3))
;;          (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
;;          (= (__ [4 5 6] 1) '(4 5 6))
;;          (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
;;          (= (__ [44 33] 2) [44 44 33 33])

(def first-input  {:coll [1 2 3]       :num-times 2 :expected '(1 1 2 2 3 3)})
(def second-input {:coll [:a :b]       :num-times 4 :expected '(:a :a :a :a :b :b :b :b)})
(def third-input  {:coll [4 5 6]       :num-times 1 :expected '(4 5 6)})
(def fourth-input {:coll [[1 2] [3 4]] :num-times 2 :expected '([1 2] [1 2] [3 4] [3 4])})
(def fifth-input  {:coll [44 33]       :num-times 2 :expected [44 44 33 33]})


(deftest replicate-sequence-test
  (is (= (rs/replicate-seq (:coll first-input) (:num-times first-input)) (:expected first-input)))
  (is (= (rs/replicate-seq (:coll second-input) (:num-times second-input)) (:expected second-input)))
  (is (= (rs/replicate-seq (:coll third-input) (:num-times third-input)) (:expected third-input)))
  (is (= (rs/replicate-seq (:coll fourth-input) (:num-times fourth-input)) (:expected fourth-input)))
  (is (= (rs/replicate-seq (:coll fifth-input) (:num-times fifth-input)) (:expected fifth-input))))

