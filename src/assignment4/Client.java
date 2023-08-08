package assignment4;

public class Client {

    public static void main(String[] args) {
        Proto proto = new Proto("Fake Data");
        IProtoAdapter iProtoAdapter = new ProtoToXMLAdapter(proto);
        XML xml = iProtoAdapter.getXML();
        System.out.println(xml.data);
    }
}
