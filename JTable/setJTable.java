DefaultTableModel tabModel;

private void setJTable() {
    // Atur Data Table
    String[] Kolom = {"No", "Kode Book", "Title"};
    tabModel = new DefaultTableModel(null, Kolom) {
        boolean[] canEdit = new boolean[]{false, false, false};

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };
    // Atur ukuran JTable
    TBuku.setModel(tabModel);
    TBuku.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    TBuku.getColumnModel().getColumn(0).setPreferredWidth(30);
    TBuku.getColumnModel().getColumn(1).setPreferredWidth(100);
    TBuku.getColumnModel().getColumn(2).setPreferredWidth(200);
    // Tambah Data Row
    Object Data[] = {no, kode, judul, pengarang, penerbit, tahun, status};
    tabModel.addRow(Data);
}
