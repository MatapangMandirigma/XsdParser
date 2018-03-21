package org.xmlet.xsdparser.xsdelements.xsdrestrictions;

import org.w3c.dom.Node;
import org.xmlet.xsdparser.xsdelements.elementswrapper.ReferenceBase;
import org.xmlet.xsdparser.xsdelements.visitors.XsdElementVisitor;

import javax.validation.constraints.NotNull;
import java.util.Map;

public class XsdMaxInclusive extends XsdIntegerRestrictions {

    public static final String XSD_TAG = "xsd:maxInclusive";
    public static final String XS_TAG = "xs:maxInclusive";

    private XsdMaxInclusive(@NotNull Map<String, String> elementFieldsMapParam) {
        super(elementFieldsMapParam);
    }

    @Override
    public void accept(XsdElementVisitor xsdElementVisitor) {
        super.accept(xsdElementVisitor);
        xsdElementVisitor.visit(this);
    }

    public static ReferenceBase parse(Node node){
        return ReferenceBase.createFromXsd(new XsdMaxInclusive(convertNodeMap(node.getAttributes())));
    }
}
