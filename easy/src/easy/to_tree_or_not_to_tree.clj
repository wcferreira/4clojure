(ns easy.to-tree-or-not-to-tree)

;; (= (__ '(:a (:b nil nil) nil)) true)





;; Binary Tree Traversal - In order
;; Visit root
;; Visit left
;; Visit right

;(defn inorder [coll]
;  (print (first sample-tree) " => ")
;  (print (first (first (rest sample-tree))) " => ")
;  (print (second (first (rest sample-tree))) " => ")
;  (print (last (first (rest sample-tree))) " => ")
;  (print (last sample-tree) " => "))
;
;(inorder tree)

;(defn inorder [tree]
;  (let [root  (first sample-tree)
;        left  (second sample-tree)
;        right (last sample-tree)]
;    (println "root:" root)
;
;    (if (seq? left)
;      (println "Left: " left " => Left is a sequence")
;      (println "Left isn't a seq"))
;
;    (if (seq? right)
;      (println "Right is a seq")
;      (println "right:" right))))

(defn inorder [tree]
  (let [my-tree tree
        root  (first my-tree)
        left  (second my-tree)
        right (last my-tree)]
    (print root " => ")
    (if (seq? left)
      (inorder left)
      (print left " => "))

    (if (seq? right)
      (inorder right)
      (print right " => "))))

(def sample-tree '(:a (:b nil nil) nil))

(inorder sample-tree)
