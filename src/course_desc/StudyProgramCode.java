/**
 */
package course_desc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Study Program Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see course_desc.Course_descPackage#getStudyProgramCode()
 * @model
 * @generated
 */
public enum StudyProgramCode implements Enumerator {
	/**
	 * The '<em><b>MTDT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTDT_VALUE
	 * @generated
	 * @ordered
	 */
	MTDT(0, "MTDT", "MTDT"),

	/**
	 * The '<em><b>BIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_VALUE
	 * @generated
	 * @ordered
	 */
	BIT(1, "BIT", "BIT"),

	/**
	 * The '<em><b>MIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIT_VALUE
	 * @generated
	 * @ordered
	 */
	MIT(2, "MIT", "MIT"),

	/**
	 * The '<em><b>MTIØT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTIØT_VALUE
	 * @generated
	 * @ordered
	 */
	MTIØT(3, "MTIØT", "MTI\u00d8T");

	/**
	 * The '<em><b>MTDT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MTDT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MTDT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MTDT_VALUE = 0;

	/**
	 * The '<em><b>BIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIT_VALUE = 1;

	/**
	 * The '<em><b>MIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIT_VALUE = 2;

	/**
	 * The '<em><b>MTIØT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MTIØT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MTIØT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MTIØT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Study Program Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StudyProgramCode[] VALUES_ARRAY =
		new StudyProgramCode[] {
			MTDT,
			BIT,
			MIT,
			MTIØT,
		};

	/**
	 * A public read-only list of all the '<em><b>Study Program Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StudyProgramCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Study Program Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StudyProgramCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StudyProgramCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Study Program Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StudyProgramCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StudyProgramCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Study Program Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StudyProgramCode get(int value) {
		switch (value) {
			case MTDT_VALUE: return MTDT;
			case BIT_VALUE: return BIT;
			case MIT_VALUE: return MIT;
			case MTIØT_VALUE: return MTIØT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StudyProgramCode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //StudyProgramCode
