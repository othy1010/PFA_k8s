/**
 */
package k8s;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Api Version</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see k8s.K8sPackage#getApiVersion()
 * @model
 * @generated
 */
public enum ApiVersion implements Enumerator {
	/**
	 * The '<em><b>V1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V1_VALUE
	 * @generated
	 * @ordered
	 */
	V1(0, "v1", "v1"),

	/**
	 * The '<em><b>Certificates k8s io v1beta1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATES_K8S_IO_V1BETA1_VALUE
	 * @generated
	 * @ordered
	 */
	CERTIFICATES_K8S_IO_V1BETA1(1, "certificates_k8s_io_v1beta1", "certificates_k8s_io_v1beta1"),

	/**
	 * The '<em><b>Rbac authorization k8s io v1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RBAC_AUTHORIZATION_K8S_IO_V1_VALUE
	 * @generated
	 * @ordered
	 */
	RBAC_AUTHORIZATION_K8S_IO_V1(2, "rbac_authorization_k8s_io_v1", "rbac_authorization_k8s_io_v1"),

	/**
	 * The '<em><b>Apps v1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPS_V1_VALUE
	 * @generated
	 * @ordered
	 */
	APPS_V1(4, "apps_v1", "apps_v1"),

	/**
	 * The '<em><b>Batch v1beta1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATCH_V1BETA1_VALUE
	 * @generated
	 * @ordered
	 */
	BATCH_V1BETA1(5, "batch_v1beta1", "batch_v1beta1"),

	/**
	 * The '<em><b>Extensions v1beta1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSIONS_V1BETA1_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSIONS_V1BETA1(6, "extensions_v1beta1", "extensions_v1beta1"),

	/**
	 * The '<em><b>Autoscaling v1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOSCALING_V1_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOSCALING_V1(7, "autoscaling_v1", "autoscaling_v1"),

	/**
	 * The '<em><b>Batch v1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATCH_V1_VALUE
	 * @generated
	 * @ordered
	 */
	BATCH_V1(8, "batch_v1", "batch_v1"),

	/**
	 * The '<em><b>Policy v1beta1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLICY_V1BETA1_VALUE
	 * @generated
	 * @ordered
	 */
	POLICY_V1BETA1(9, "policy_v1beta1", "policy_v1beta1");

	/**
	 * The '<em><b>V1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V1
	 * @model name="v1"
	 * @generated
	 * @ordered
	 */
	public static final int V1_VALUE = 0;

	/**
	 * The '<em><b>Certificates k8s io v1beta1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATES_K8S_IO_V1BETA1
	 * @model name="certificates_k8s_io_v1beta1"
	 * @generated
	 * @ordered
	 */
	public static final int CERTIFICATES_K8S_IO_V1BETA1_VALUE = 1;

	/**
	 * The '<em><b>Rbac authorization k8s io v1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RBAC_AUTHORIZATION_K8S_IO_V1
	 * @model name="rbac_authorization_k8s_io_v1"
	 * @generated
	 * @ordered
	 */
	public static final int RBAC_AUTHORIZATION_K8S_IO_V1_VALUE = 2;

	/**
	 * The '<em><b>Apps v1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPS_V1
	 * @model name="apps_v1"
	 * @generated
	 * @ordered
	 */
	public static final int APPS_V1_VALUE = 4;

	/**
	 * The '<em><b>Batch v1beta1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATCH_V1BETA1
	 * @model name="batch_v1beta1"
	 * @generated
	 * @ordered
	 */
	public static final int BATCH_V1BETA1_VALUE = 5;

	/**
	 * The '<em><b>Extensions v1beta1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSIONS_V1BETA1
	 * @model name="extensions_v1beta1"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSIONS_V1BETA1_VALUE = 6;

	/**
	 * The '<em><b>Autoscaling v1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOSCALING_V1
	 * @model name="autoscaling_v1"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOSCALING_V1_VALUE = 7;

	/**
	 * The '<em><b>Batch v1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATCH_V1
	 * @model name="batch_v1"
	 * @generated
	 * @ordered
	 */
	public static final int BATCH_V1_VALUE = 8;

	/**
	 * The '<em><b>Policy v1beta1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLICY_V1BETA1
	 * @model name="policy_v1beta1"
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_V1BETA1_VALUE = 9;

	/**
	 * An array of all the '<em><b>Api Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ApiVersion[] VALUES_ARRAY =
		new ApiVersion[] {
			V1,
			CERTIFICATES_K8S_IO_V1BETA1,
			RBAC_AUTHORIZATION_K8S_IO_V1,
			APPS_V1,
			BATCH_V1BETA1,
			EXTENSIONS_V1BETA1,
			AUTOSCALING_V1,
			BATCH_V1,
			POLICY_V1BETA1,
		};

	/**
	 * A public read-only list of all the '<em><b>Api Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ApiVersion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Api Version</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApiVersion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApiVersion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Api Version</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApiVersion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApiVersion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Api Version</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApiVersion get(int value) {
		switch (value) {
			case V1_VALUE: return V1;
			case CERTIFICATES_K8S_IO_V1BETA1_VALUE: return CERTIFICATES_K8S_IO_V1BETA1;
			case RBAC_AUTHORIZATION_K8S_IO_V1_VALUE: return RBAC_AUTHORIZATION_K8S_IO_V1;
			case APPS_V1_VALUE: return APPS_V1;
			case BATCH_V1BETA1_VALUE: return BATCH_V1BETA1;
			case EXTENSIONS_V1BETA1_VALUE: return EXTENSIONS_V1BETA1;
			case AUTOSCALING_V1_VALUE: return AUTOSCALING_V1;
			case BATCH_V1_VALUE: return BATCH_V1;
			case POLICY_V1BETA1_VALUE: return POLICY_V1BETA1;
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
	private ApiVersion(int value, String name, String literal) {
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
	
} //ApiVersion
