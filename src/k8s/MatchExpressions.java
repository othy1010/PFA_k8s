/**
 */
package k8s;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Expressions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.MatchExpressions#getKey <em>Key</em>}</li>
 *   <li>{@link k8s.MatchExpressions#getValues <em>Values</em>}</li>
 *   <li>{@link k8s.MatchExpressions#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getMatchExpressions()
 * @model
 * @generated
 */
public interface MatchExpressions extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see k8s.K8sPackage#getMatchExpressions_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link k8s.MatchExpressions#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see k8s.K8sPackage#getMatchExpressions_Values()
	 * @model required="true" transient="true"
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see k8s.K8sPackage#getMatchExpressions_Operator()
	 * @model required="true"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link k8s.MatchExpressions#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

} // MatchExpressions
