package assignment4;

public class ProtoToXMLAdapter implements IProtoAdapter{

    Proto protoObject;

    public ProtoToXMLAdapter(Proto _protoObject){
        this.protoObject = _protoObject;

    }

    @Override
    public XML getXML() {
        // How to get XML from Proto I don't have any clue
        XML convertedFile = new XML("<xml>" + protoObject.data + "</xml>");
        return convertedFile;
    }
}
