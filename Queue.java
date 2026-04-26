class Queue {
    Node front, rear;
    int size = 0;

    void enqueue(String kode, String nama, int total) {
        if (size >= 5) {
            System.out.println("Antrian penuh (max 5)!");
            return;
        }

        Node baru = new Node(kode, nama, total);

        if (rear == null) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }

        size++;
        System.out.println("Pelanggan masuk antrian!");
    }

    Node dequeue() {
        if (front == null) {
            System.out.println("Antrian kosong!");
            return null;
        }

        Node temp = front;
        front = front.next;

        if (front == null) rear = null;

        size--;
        return temp;
    }

    void tampil() {
        if (front == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        Node temp = front;
        System.out.println("=== ANTRIAN ===");
        while (temp != null) {
            System.out.println(temp.kode + " | " + temp.nama + " | " + temp.total);
            temp = temp.next;
        }
    }
}