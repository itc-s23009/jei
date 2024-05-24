enum Connection {
	OFFLINE, ONLINE
}


class d48Q22 {
	public void main(String[] args) {
		Connection s = Connection.OFFLINE;
		if (s == Connection.OFFLINE) {
			s = Connection.ONLINE;
		}
		System.out.println(s);
	}
}
