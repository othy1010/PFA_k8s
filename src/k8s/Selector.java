/**
 */
package k8s;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.Selector#getMatchLabels <em>Match Labels</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getSelector()
 * @model
 * @generated
 */
public interface Selector extends EObject {
	/**
	 * Returns the value of the '<em><b>Match Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Labels</em>' attribute.
	 * @see #setMatchLabels(Map)
	 * @see k8s.K8sPackage#getSelector_MatchLabels()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getMatchLabels();

	/**
	 * Sets the value of the '{@link k8s.Selector#getMatchLabels <em>Match Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Labels</em>' attribute.
	 * @see #getMatchLabels()
	 * @generated
	 */
	void setMatchLabels(Map<String, String> value);

} // Selector
