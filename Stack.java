class Stack {
    Node top;

    void push(Node data) {
        data.next = top;
        top = data;
        System.out.println("Transaksi masuk ke riwayat.");
    }

    void tampil() {
        if (top == null) {
            System.out.println("Belum ada transaksi.");
            return;
        }

        Node temp = top;
        System.out.println("=== RIWAYAT TRANSAKSI ===");
        while (temp != null) {
            System.out.println(temp.kode + " | " + temp.nama + " | " + temp.total);
            temp = temp.next;
        }
    }
}