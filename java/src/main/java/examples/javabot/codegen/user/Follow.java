package examples.javabot.codegen.user;

import com.daml.ledger.javaapi.data.Party;
import com.daml.ledger.javaapi.data.Value;
import com.daml.ledger.javaapi.data.codegen.DamlRecord;
import com.daml.ledger.javaapi.data.codegen.PrimitiveValueDecoders;
import com.daml.ledger.javaapi.data.codegen.ValueDecoder;
import java.lang.Deprecated;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Follow extends DamlRecord<Follow> {
  public static final String _packageId = "2e0159bf1cf8111e91e1a6049bc23ec527b4bc0d91efc72482c36dd1fe4fe073";

  public final String userToFollow;

  public Follow(String userToFollow) {
    this.userToFollow = userToFollow;
  }

  /**
   * @deprecated since Daml 2.5.0; use {@code valueDecoder} instead
   */
  @Deprecated
  public static Follow fromValue(Value value$) throws IllegalArgumentException {
    return valueDecoder().decode(value$);
  }

  public static ValueDecoder<Follow> valueDecoder() throws IllegalArgumentException {
    return value$ -> {
      Value recordValue$ = value$;
      List<com.daml.ledger.javaapi.data.DamlRecord.Field> fields$ = PrimitiveValueDecoders.recordCheck(1,
          recordValue$);
      String userToFollow = PrimitiveValueDecoders.fromParty.decode(fields$.get(0).getValue());
      return new Follow(userToFollow);
    } ;
  }

  public com.daml.ledger.javaapi.data.DamlRecord toValue() {
    ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field> fields = new ArrayList<com.daml.ledger.javaapi.data.DamlRecord.Field>(1);
    fields.add(new com.daml.ledger.javaapi.data.DamlRecord.Field("userToFollow", new Party(this.userToFollow)));
    return new com.daml.ledger.javaapi.data.DamlRecord(fields);
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (!(object instanceof Follow)) {
      return false;
    }
    Follow other = (Follow) object;
    return Objects.equals(this.userToFollow, other.userToFollow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.userToFollow);
  }

  @Override
  public String toString() {
    return String.format("examples.javabot.codegen.user.Follow(%s)", this.userToFollow);
  }
}